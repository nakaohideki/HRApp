public class Employee implements Comparable<Employee>   //Classe pública funcionário já com implementação de interface 
                                                        //para comparar um funcionário com outro funcionário.
{
    private int id; //Variável inteira privada para armazenar o id do funcionário.
    private double salary;  //Variável double privado para armazenar o salário do funcionário.
    private String department;  //Variável String privada para armazenar o departmento de cadastro do funcionário.
    private String name;    //Variável String privada para armazenar o nome do funcionário.

    protected Employee(int id, double salary, String department, String name)   //Construtor protegido para instanciar
                                                                                //a classe Employee.
    {
        this.id = id;   //Atribui o id informado ao id do objeto criado.
        this.salary = salary;   //Atribui o salário informado ao salário do objeto criado.
        this.department = department;   //Atribui o departamento informando ao departamento do objeto criado.
        this.name = name;   //Atribui o nome informado ao nome do objeto criado.
    }

    protected int getId()   //Método que acessa o id do objeto referenciado.
    {
        return id;  //Retorna o id do objeto referenciado.
    }

    protected void setId(int id)    //Método que altera o id do objeto referenciado para o id informado.    
    {
        this.id = id;   //Atribui o id informado ao id do objeto referenciado.
    }

    protected double getSalary()    //Método que acessa o salário do objeto referenciado.
    {
        return salary;  //Retorna o salário do objeto referenciado.
    }

    protected void setSalary(double salary) //Método que altera o salário do objeto referenciado para o salário
                                            //informado.
    {
        this.salary = salary;   //Atribui o salário informado ao salário do objeto referenciado.
    }

    protected String getDepartment()    //Método que acessa o departmento do objeto referenciado.
    {
        return department;  //Retorna o departamento do objeto referenciado.
    }

    protected void setDepartment(String department) //Método que altera o departamento do objeto referenciado para o
                                                    //departamento informado.
    {
        this.department = department;   //Atribui o departamento informado ao departamento do objeto referenciado.
    }

    protected String getName()  //Método que acessa o nome do objeto referenciado.
    {
        return name;    //Retorna o nome do objeto referenciado.
    }

    protected void setName(String name) //Método que altera o nome do objeto referenciado para o nome informado.
    {
        this.name = name;   //Atribui o nome informado ao nome do objeto referenciado.
    }

    @Override   //Notação que sobreescreve os método abaixo para os objetos desta classe.
    public String toString()    //Método que retorna uma representação convertida em String dos objetos desta classe.
    {
        return "|  " + getId() + "  | US$ " + getSalary() + " |    " + getDepartment() + "    | "
                + getName() + " |";    //Retorna a representação String de formatação dos dados de cada funcionário.
    }

    public int compareTo(Employee other)    //Método que compara um objeto desta classe com outro desta classe.
    {
      //return this.getName().compareTo(other.getName());   //Retorna a classificação por ordem alfabetica de nome dos
                                                            //funcionários comparados.
        return this.getId() > other.getId() ? 1 : this.getId() < other.getId() ? -1 : 0;    
        //Retorna a classificação por ordem ascendente numérica de id dos objetos comparados.
    }
}