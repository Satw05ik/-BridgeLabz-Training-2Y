# Student Result Management System (SRMS)

Simple JDBC-based CRUD application (console) demonstrating student and result management.

Requirements:
- Java 17+
- Maven

Run:

```pwsh
cd "d:\Codes\BridgeLabz-Training-2Y\StudentResultManagement"
mvn compile exec:java -Dexec.mainClass="com.example.srms.MainApp"
```

Notes:
- Uses embedded H2 (file) database stored under `./data/srms` by default.
- Tables are created automatically on first run.
