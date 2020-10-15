# SauceDemoWizeline

Para correr los 10 escenarios y general el reporte de allure en
intellij terminal command line:

mvn clean test allure:report -f pom.xml

allure serve ./target/allure-results
