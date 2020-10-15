# SauceDemoWizeline

Para correr los 10 escenarios y general el reporte de allure, mediante la terminal de IntelliJ:

mvn clean test allure:report -f pom.xml

allure serve ./target/allure-results

de otra manera:

correr RunnerTest Run 'RunnerTest'
y en terminal crear y ejecutar Allure report:

mvn clean test allure:report -f pom.xml

allure serve ./target/allure-results




