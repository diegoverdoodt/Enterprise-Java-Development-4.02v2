# Enterprise-Java-Development-4.02v2

Intro to Spring Boot Lab (4.02)


Instructions

Create a new GitHub repository named Enterprise-Java-Development-4.02
Add your instructor and the class graders to your repository and ensure that your repository is private. Public repositories will receive a zero on the assignment.
If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
Upload the code for all of the following prompts to your repository.
Submit a URL link to your repository below.



Set up

For these labs, you will need to create two database tables and seed them with some sample data. The database data represents mock clients for a multi-city hospital.


employee_id 	department  	  name  	          status
356712	      cardiology	    Alonso Flores	    ON_CALL
564134	      immunology	    Sam Ortega	      ON
761527	      cardiology	    German Ruiz	      OFF
166552	      pulmonary	      Maria Lin	        ON
156545	      orthopaedic	    Paolo Rodriguez	  ON_CALL
172456	      psychiatric	    John Paul Armes	  OFF
Note that admitted_by is a foreign key to the employee table.


patient_id	  name	              date_of_birth	    admitted_by
1	            Jaime Jordan	      1984-03-02	      564134
2	            Marian Garcia	      1972-01-12	      564134
3	            Julia Dusterdieck	  1954-06-11	      356712
4	            Steve McDuck	      1931-11-10	      761527
5	            Marian Garcia	      1999-02-15	      172456



Specifications

Create a route to get all doctors.
Create a route to get a doctor by employee_id.
Create a route to get doctors by status.
Create a route to get doctors by department.
Create a route to get all patients.
Create a route to get a patient by patient_id.
Create a route to get patients date of birth within a specified range.
Create a route to get patients by the department that their admitting doctor is in (For example, get all patients admitted by a doctor in cardiology).
Create a route to get all patients with a doctor whose status is OFF.
All your challenges are on their way

Thanks for uploading your work!

Edit lab
PREVIOUS
GET Requests + params
NEXT
POST Requests and Validation
