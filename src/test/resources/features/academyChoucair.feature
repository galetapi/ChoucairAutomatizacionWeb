#Autor: Daniel Galeano

@stories
Feature: Academy Choucair
  As an user, I want to learn how to automate in screamplay at the Choucair Academy whith the automation course

  @Scenario1
  Scenario: Search for a automation course
    Given than Daniel want to learn automation at the academy Choucair
      | strUser    | strPassword   |
      | 1020462103 | Choucair2021* |
    When he search for the course on the choucair academy platform
      | strCourse                           |
      | Guías Técnicas - Analista Financial |
    Then he finds the course called resources
      | strCourse                           |
      | Guías Técnicas - Analista Financial |






