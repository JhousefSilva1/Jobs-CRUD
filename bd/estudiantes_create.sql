-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-08-17 04:56:22.829

-- tables
-- Table: U_Courses
CREATE TABLE U_Courses (
    U_id_Courses serial  NOT NULL,
    U_CoursesName varchar(500)  NOT NULL,
    U_CoursesSigla varchar(10)  NOT NULL,
    CONSTRAINT U_Courses_pk PRIMARY KEY (U_id_Courses)
);

-- Table: U_Students
CREATE TABLE U_Students (
    U_id_Student serial  NOT NULL,
    U_StudentName varchar(500)  NOT NULL,
    U_StudentSurname varchar(500)  NOT NULL,
    CONSTRAINT U_Students_pk PRIMARY KEY (U_id_Student)
);

-- End of file.

