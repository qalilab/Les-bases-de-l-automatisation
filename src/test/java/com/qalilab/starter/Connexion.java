package com.qalilab.starter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Connexion {

    @Test
    void login() {
        // initialisation du driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Ouverture du site web
        driver.get("https://askomdch.com/account/");

        // Identification des elements

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.name("login"));

        // Saisie des informations d'identification

        usernameField.sendKeys("testingToday1");
        passwordField.sendKeys("test1234");

        // Soumission du formulaire
        loginButton.click();

        // fermeture du navigateur
        driver.quit();



    }
}
