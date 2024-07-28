# jdbc-connection
 this is
**
String jdbcUrl = System.getenv("DB_JDBC_URL");
String username = System.getenv("DB_USERNAME");
String password = System.getenv("DB_PASSWORD");
String driverClassName = System.getenv("DB_DRIVER_CLASS_NAME");
**
The commands to export environment variables are meant to be run in your terminal or command prompt before you execute your Java application. Here’s how you can do it based on your operating system:
For Linux/macOS:

    Open your terminal.

    Paste the following commands:

    sh

    export DB_JDBC_URL="jdbc:mysql://localhost:3306/mydatabase?ssl-mode=REQUIRED"
    export DB_USERNAME="root"
    export DB_PASSWORD=""
    export DB_DRIVER_CLASS_NAME="com.mysql.cj.jdbc.Driver"

    After setting the environment variables, run your Java application in the same terminal session.

For Windows (Command Prompt):

    Open Command Prompt.

    Paste the following commands:

    cmd

    set DB_JDBC_URL=jdbc:mysql://localhost:3306/mydatabase?ssl-mode=REQUIRED
    set DB_USERNAME=root
    set DB_PASSWORD=
    set DB_DRIVER_CLASS_NAME=com.mysql.cj.jdbc.Driver

    After setting the environment variables, run your Java application in the same Command Prompt session.

For Windows (PowerShell):

    Open PowerShell.

    Paste the following commands:

    powershell

    $env:DB_JDBC_URL="jdbc:mysql://localhost:3306/mydatabase?ssl-mode=REQUIRED"
    $env:DB_USERNAME="root"
    $env:DB_PASSWORD=""
    $env:DB_DRIVER_CLASS_NAME="com.mysql.cj.jdbc.Driver"

    After setting the environment variables, run your Java application in the same PowerShell session.

Running Your Java Application:

After setting the environment variables, you can compile and run your Java application as usual. For example, if you use javac and java commands:

sh

javac -cp . com/airtel/oim/main/GetStatusOfUserEveryResetChangePassword.java
java -cp . com.airtel.oim.main.GetStatusOfUserEveryResetChangePassword

Alternative Method: Setting Environment Variables in Your IDE:

If you use an Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse, you can set environment variables in your run configurations:
IntelliJ IDEA:

    Open Run/Debug Configurations.

    Select your application configuration.

    In the "Environment variables" field, set your variables:

    bash

    DB_JDBC_URL=jdbc:mysql://localhost:3306/mydatabase?ssl-mode=REQUIRED;DB_USERNAME=root;DB_PASSWORD=;DB_DRIVER_CLASS_NAME=com.mysql.cj.jdbc.Driver

Eclipse:

    Open Run Configurations.

    Select your application configuration.

    Go to the "Environment" tab.

    Click "New" to add each environment variable:
        Name: DB_JDBC_URL
        Value: jdbc:mysql://localhost:3306/mydatabase?ssl-mode=REQUIRED
        Name: DB_USERNAME
        Value: root
        Name: DB_PASSWORD
        Value: ``
        Name: DB_DRIVER_CLASS_NAME
        Value: com.mysql.cj.jdbc.Driver

By setting the environment variables in your terminal or IDE, you ensure that your application can securely access the database configuration without hardcoding sensitive information.
