package com.ninja_squad.geektic.dao;

import java.util.List;

import com.ninja_squad.dbsetup.DbSetup;
import static org.junit.Assert.assertEquals;

import dao.dao;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import user.user;

/**
 * This is example code for a DAO test.
 * @author JB Nizet
 */
public class ExampleDaoTest extends BaseDaoTest {

    // You can autowire the DAO to test here. For example:
    // @Autowired
    // private ExampleDao exampleDao;

	@Autowired
	private dao dao;
	
    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf(); // TODO define your operations here.
        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }

    @Test
    public void testSomeDaoMethod() {
    	@Test
        public void testFindAll() {
    		List<user> expected = ;
    		List<user> response = dao.findAll();
    		 assertEquals(expected, response);
    	
    	}
        // implement your test here, by calling the exampleDao method to test.
    }
}
