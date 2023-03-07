class Person {
    protected String name;
    protected int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}

class Employee extends Person {
    protected long salary;
    protected int startingDate;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(int startingDate) {
        this.startingDate = startingDate;
    }
}

class Doctor extends Employee {
    protected String[] patients;

    public String[] getPatients() {
        return patients;
    }

    public void setPatients(String[] patients) {
        this.patients = patients;
    }
}

class Patient extends Person {
    protected int date;
    protected String[] illnesses;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String[] getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(String[] illnesses) {
        this.illnesses = illnesses;
    }
}