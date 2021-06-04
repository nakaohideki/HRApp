import java.util.Arrays;    //Importa pacote de manipulação de matrizes.

public class HRApp  //Classe pública principal HRApp
{
    public static void main(String[] args)  //Método principal estático da classe HRApp.
    {
        Department departmentobject = new Department("IT");   //Instancia novo objeto do tipo department na variável
                                                            //departmentname e atribui o parâmetro informado ao nome
                                                            //do departamento criado.
        Department[] department = new Department[10];   //Cria matriz do tipo department de comprimento 10 chamado 
                                                        //department.
        Employee[] company =    //Cria matriz do tipo Employee chamada company e atribui a ela todos os objetos 
                                //criados com os dados de todos os funcionários da companhia.
        {
            new Employee(10001, 10000.53, "HR", "Mark"), 
            new Employee(10002, 10654.51, "HR", "John"),
            new Employee(10003, 10000.52, "HR", "Tedy"), 
            new Employee(10004, 65454.53, "HR", "Mary"),
            new Employee(10005, 10595.44, "HR", "Kate"), 
            new Employee(10006, 10595.45, "HR", "Gary"),
            new Employee(10007, 10595.46, "HR", "Carl"), 
            new Employee(10008, 10595.54, "IT", "Mike"),
            new Employee(10009, 10595.41, "IT", "Sean"), 
            new Employee(10010, 10595.33, "IT", "Paul"),
            new Employee(10011, 10595.25, "IT", "Rick") 
        };

        Arrays.sort(company);   //Ordena os objetos da matriz company por ordem alfabética de nome ou ascendente de id
                                //dependendo da linha que for executada no método compareTo da classe Employee.
        departmentobject.printsingleemployeedata(company, 10007);   //Imprime os dados do funcionário correspondente
                                                                    //ao id fornecido.
        department = departmentobject.addEmployees(company, department);  //Adicionam os dados dos funcionários da 
                                                                        //matriz company ao departamento informado
                                                                        //atribuindo-os ao objeto department.
        departmentobject.catchEmployees(department);  //Retorna e imprime os dados dos funcionários do departamento
                                                    //adicionado.
        departmentobject.printEmployeeNumber(department);   //Imprime a quantidade de funcionários pertencentes ao 
                                                            //departamento adicionado.
        departmentobject.getTotalSalary(department);    //Calcula o salário total do departamento informado.

        departmentobject.printTotalSalary(department);  //Imprime o salário total do departamento informado.

        departmentobject.getAverageSalary(department);  //Calcula o salário médio do departamento informado.

        departmentobject.printAverageSalary(department);  //Imprime o salário médio do departamento informado.
    }
}