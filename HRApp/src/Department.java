public class Department //Classe de acesso público Departamento
{
    private String departmentName;  //Variável String privada para armazenar o nome do departamento.
    private Employee employee;    //Variável Employee para armazenar os dados de funcionário.

    protected Department(String departmentName) //Construtor protegido para instanciar a classe Departamento com o
                                                //nome do departamento informado
    {
        this.departmentName = departmentName;   //Atritui o nome do departamento informado ao novo departamento.
    }

    protected String getDepartmentName()    //Método que acessa o nome do departamento do objeto referenciado.
    {      
        return departmentName;  //Retorna o nome do departamento do objeto referenciado.
    }

    protected void setDepartmentName(String departmentName) //Método que altera o nome do departamento do objeto
                                                            //referenciado para o nome do departamento informado.
    {
        this.departmentName = departmentName;   //Atribui o nome do departamento informado ao nome do departamento
                                                //do objeto referenciado.
    }       

    protected Employee getEmployee()  //Método que acessa os dados do funcionário do objeto referenciado.
    { 
        return employee;    //Retornam os dados do funcionário do objeto referenciado.
    }

    protected void setEmployee(Employee employee)   //Método que altera os dados de funcionário do departamento  
                                                    //referenciado para os dados de funcionário informados.
    {
        this.employee = employee;   //Atribuem os dados de funcionário informados aos dados de funcionário do
                                    //objeto referenciado.
    }

    protected void printsingleemployeedata(Employee[] employee, int id) //Método que imprimem dados de funcionário
                                                                        //individualmente por id.
    {
        int counter = 0;    //Declaração de variável inteira que conta funcionários com o id correspondente.
        System.out.println("\nSingle employee data for supplied id number " + id + ":\n");   //Imprime mensagem 
                                                                                                //inicial.
        for (Employee item : employee)  //Laço que executa rotina para cada funcionário da matriz informada.
        {
            if (id == item.getId()) //Laço que verifica qual funcionário da matriz informada possui o id informado. 
            {
                System.out.println("|Id number|    Salary    |" +
        "Department| Name |\n" + item + "\n");   //Imprime os dados do funcionário com o id informado.
                counter++;  //Conta o funcionário.
            }
        }
        switch (counter)    //Laço que executa rotina para demais possibilidades.
        {
            case 0: //rotina que é executada quando não são encontrados funcionários com o id informado 
            System.out.println("No employee was found with the informed id number.");  //Imprime mensagem de não exito
                                                                                       //na pesquisa.
            break;  //Sai da verificação.

            case 1: //rotina já executada acima.
            break;  //Sai da verificação.
        
            default: 
            System.out.println("The employee list contains " + counter + " employees with the same informed id. " +
            "Please contact the IT departament."); //Imprime mensagem de erro solicitando aviso ao departamento de TI. 
            break;  //Sai da verificação.
        }
    }

    protected Department[] addEmployees(Employee[] company, Department[] department)    //Método que adiciona os dados
                                                                                        //dos funcionários ao 
                                                                                        //departamento. 
    {
        int counter = 0;    //Contador que conta os funcionários que serão adicionados ao departamento.
        for (Employee item : company)   //Laço que executa rotina para cada funcionário da matriz company informada.
        {
            counter = item.getDepartment().equals(this.getDepartmentName()) ? counter + 1 : counter;
            //Conta quantos funcionários da matriz company são do mesmo departamento informado.     
        }
        if (counter>10) //Executa uma rotina caso a quantidade de funcionários seja maior que 10.
        {
            System.out.println("Overload of employee for " + this.getDepartmentName() + " department. \nOnly the 10 "+
            "first Id's employees assigned for this department will be accept.");   //Imprime mensagem de erro.
        }
        department = new Department[counter];   //Cria a matriz departamento com tamanho definido pelo contador.
        System.out.println("Employees of " + this.getDepartmentName() + " department:\n\n|Id number|    Salary    |" +
        "Department| Name |" );    //Imprime o cabeçalho da tabela de dados dos funcionários.
        counter = 0;    //Zera o contador para nova contagem de funcionários.
        for (Employee item : company)   //Laço que executa rotina para cada funcionário da matriz company informada.
        {
            if (this.getDepartmentName().equals(item.getDepartment()))  //Laço que verifica qual funcionário da matriz
                                                                        //company pertence ao departamento informado.
            {
                Employee employee = new Employee (item.getId(), item.getSalary(), item.getDepartment(), 
                item.getName());    //Criação de objeto employee com id, salário, departamento e nome do funcionário
                                    //correspondente.
                department[counter] = new Department(item.getDepartment()); 
                //Cria objeto na matriz departamento atribuindo o nome do departamento correspondente.
                department[counter].setEmployee(employee);  //Altera os dados do objeto na matriz departamento no
                                                            //indice da contagem para os dados do funcionário
                                                            //correspondente.
                //System.out.println(department[counter].getEmployee());  //Imprime os dados do funcionário
                                                                          //correspondente.
                counter++;  //Conta o funcionário correspondente.
            }
        }
        return department;  //retorna o departamento contendo os funcionários adicionados.
    }

    protected void catchEmployees (Department[] department) //Imprime os dados dos funcionários adicionados.
    {   
        {
            for (Department item : department)  //Acessa os indíces da matriz de funcionários do departamento.
            {
                System.out.println(item.getEmployee()); //Imprime os dados dos funcionários do departamento.
            }
        }
    }

    protected void printEmployeeNumber (Department[] department)    //Imprime o número de funcionários no departamento.
    {
        switch (department.length)  //executa loop em função da quantidade de funcionários do departamento.
        {
            case 0: //rotina executada quando não existir funcionário no departamento solicitado.
            System.out.println("\nThe " + this.getDepartmentName() + "department has no employees.\n"); //imprime 
                                                                                                        //aviso.
            case 1: //rotina executada quando existir 1 funcionário no departamento solicitado.
            System.out.println("\nThe " + this.getDepartmentName() + " department has 1 employee.\n");  //imprime
                                                                                                        //aviso.
            default: //rotina para quando existirem mais de 1 funcionário no departamento solicitado.
            System.out.println("\nThe " + this.getDepartmentName() + " department has " + department.length
             + " employees.\n");   //imprime aviso.
        }
    }

    protected double getTotalSalary(Department[] department)    //Calcula o salário total do departamento informado.
    {
        double totalSalary = 0.0;   //Variável onde serão armazenados os salários somados.
        for (Department item : department)  //Acessa cada indice da matriz departmento informada.
        {
            totalSalary = totalSalary + item.getEmployee().getSalary(); //Soma o salário para cada funcionário.
        }
        return totalSalary; //Retorna o valor total do salário do departamento informado.
    }

    protected void printTotalSalary (Department[] department)   //Imprime salário total do departamento
    {
        System.out.println("The total salary of " + this.getDepartmentName() + " is US$ " + 
        this.getTotalSalary(department) + ".\n"); //Imprime o salário total do departamento informado.
    }

    protected double getAverageSalary(Department[] department)  //Cálcula o salário médio do departamento informado.
    {
        try //Rotina para tratar possiveis eventos durante a execução do programa.
        {   
            return Math.floor(getTotalSalary(department) / department.length * 100) / 100;  
            //Retorna o cálculo do salário médio arredondado em 2 casas decimais.
        }
        catch (ArithmeticException e)   //Tratativa para divisão por zero no cálculo do salário médio.
        {
            return 0;   //retorna o valor zero.
        }
    }
        
    protected void printAverageSalary (Department[] department) //Imprime o salário médio do departamento informado.
    {
        switch(department.length)   //laço para tratar eventos específicos.
        {
            case 0: //rotina para quando não existir funcionários no departamento informado.
            System.out.println("The average salary for the " + this.getDepartmentName() + " could no be calculated " +
            "because the total employee working at this department is 0 employee.\n");    //Retorna aviso de erro.

            default:    //rotina para cálculo normal.
            System.out.println("The average salary of " + this.getDepartmentName() + " department is US$ " + 
            this.getAverageSalary(department) + ".\n");   //Retorna o valor do salário médio do departamento informado.
        }
    }
    @Override   //Notação que sobreescreve os método abaixo para os objetos desta classe.
    public String toString()    //Método que retorna uma representação convertida em String dos objetos desta classe.
    {
        return getDepartmentName() + " department.";    //Retorna a representação String de formatação dos dados do 
                                                            //departamento.
    }
}