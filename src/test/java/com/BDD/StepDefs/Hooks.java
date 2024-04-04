package com.BDD.StepDefs;

import com.BDD.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

    @Before
    public void setup(){
        initializeDriver();
    }

    @After
    public void quit(){
//        teardown();
    }

}
