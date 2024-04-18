package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Featurefiles\\Brmlogin.feature",
      glue = {"com.stepdefinition", "com.Pom" }, monochrome = true)
public class Brmlogin_runner {

}
