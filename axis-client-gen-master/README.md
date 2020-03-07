# axis-client-gen
Axis 1.4 Client Generation Project

## STEPS

#### 1- Create A Console Application

#### 2- Fill the blanks:

Main Class: org.apache.axis.wsdl.WSDL2Java

Program Arguments: <WSLD_LOCATION> -o <JAVA_DIR> -s -w --skeletonDeploy true

Example:
/Users/AbidinK/Downloads/NetflowOpService.wsdl -o /Users/AbidinK/workspace/IdeaProjects/axis-client-gen/src/main/java -s -w --skeletonDeploy true

Working directory: <PROJECT_DIR>

Example:
/Users/AbidinK/workspace/IdeaProjects/axis-client-gen

#### 3- Run console application and check generated java files on path <PROJECT_DIR>/src/main/java

#### 4- Update pom according to jar properties
Example 1:
    <groupId>com.example</groupId>
    <artifactId>axis-client-gen</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

Example 2:
    <groupId>tr.com.tellcom.emptor</groupId>
    <artifactId>crmTransformationService</artifactId>
    <version>1.0.9</version>
    <packaging>jar</packaging>

#### 4- Create package by using maven commands
mvn clean install

#### 5- You can use generated jar or you can create it manually by using below command
jar cf "<jar-name>_<jar-version>.jar" folder1 folder2 file1 file2 ..

example:
jar cf "tr_com_example_axis_1.0.0.jar" tr axis.wsdl
tr: folder includes class files which are generated at Step 4

