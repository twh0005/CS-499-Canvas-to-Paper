package cs499;

import static cs499.data_classes.Tables.REFERENCE_MATERIAL;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class ReferenceMaterial {
	
	private int id;
	
	private String name;
	
	private String filepath;
		
	private String description;
	
	public ReferenceMaterial(int id) {
		this.id = id;
		loadReference();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFilepath() {
		return this.filepath;
	}
	
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void loadReference() {
		
		String url = "jdbc:sqlite:./db/canvas2paper.db";
		
		try (Connection conn = DriverManager.getConnection(url)) {
            DSLContext create = DSL.using(conn, SQLDialect.SQLITE);     
            
            Record result = create.select()
            		.from(REFERENCE_MATERIAL)
            		.where(REFERENCE_MATERIAL.ID.eq(id))
            		.fetchOne();

            setName(result.getValue(REFERENCE_MATERIAL.NAME));
            setDescription(result.getValue(REFERENCE_MATERIAL.DESCRIPTION));
            setFilepath(result.getValue(REFERENCE_MATERIAL.CONTENT));

                System.out.println("Name: " + name + " description: " + description);
                System.out.println("Content: " + filepath);
            } catch (Exception e) {
                e.printStackTrace();
            }
       }
	
	public void saveReference() {
		String url = "jdbc:sqlite:./db/canvas2paper.db";
		
		try (Connection conn = DriverManager.getConnection(url)) {
            DSLContext create = DSL.using(conn, SQLDialect.SQLITE);     
            
            Record exists = create.select().from(REFERENCE_MATERIAL).where(REFERENCE_MATERIAL.ID.eq(id)).fetchOne();
            
            if(exists == null) {
            	create.insertInto(REFERENCE_MATERIAL,
            		REFERENCE_MATERIAL.ID,
            		REFERENCE_MATERIAL.NAME,
            		REFERENCE_MATERIAL.DESCRIPTION,
            		REFERENCE_MATERIAL.CONTENT)
            		.values(id, name, description, filepath)
            		.execute();
            }
            else {
            	create.update(REFERENCE_MATERIAL)
            	.set(REFERENCE_MATERIAL.NAME, name)
            	.set(REFERENCE_MATERIAL.DESCRIPTION, description)
            	.set(REFERENCE_MATERIAL.CONTENT, filepath)
            	.where(REFERENCE_MATERIAL.ID.eq(id))
            	.execute();
            }
            
            } catch (Exception e) {
                e.printStackTrace();
            }
		
	}
        
}