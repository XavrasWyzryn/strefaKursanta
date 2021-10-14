package department;

import employee.Employee;

public class DepartmentUtils {
    // stworzyc cialo ponizszej metody statycznej, ktora przerzuci pracownika z jednej placowki do drugiej
    public static void relocateEmployee(Department relocateFromDepartment,
                                   Employee employeeToRelocate,
                                   Department relocateToDepartment) {

        // przy pomocy metody .equals() znaleźć pracownika w relocateFromDepartment i potem analogicznie jak
        // w klasie RentingSystem.addBookToCollection zwiekszyc liste pracownikow w relocateToDepartment
        // a nastepnie zabrac tego jednego pracownika z relocateFromDepartment i zmniejszyc rozmiar tablicy o 1
    }
}
