#Author: ivanbermudez@cbit-online.com
@End2End
Feature: Main de periferia
  Ejecucion de prueba en periferia

  Scenario: Ejecucion main
    Given Aplicacion http://172.16.20.120:8090/account-1.0-SNAPSHOT/login
    Then Registrar usuario: ivanLeonard y contraseña: prueba123
    Then Loguear usuario: ivanLeonard y contraseña: prueba123
    Then Logout
    And Limpiar BD
