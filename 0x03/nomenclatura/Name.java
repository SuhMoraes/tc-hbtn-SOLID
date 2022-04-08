public class Name {
    public class Name {
        //variáveis que falam por si só
        //A
        public Date modifiedDate;
        public List<Testcase> findAllTestcasesByUser(Name.User user){};


        //Declarações corretas
        //A
        public List<Account> AccountList;

        // Sem Prefixos

        //B
        public void deleteUser(Name.User user){};

        // Evite mapa mental
        //B
        public URL url;

        // Claase possui nomes próprios, funções devem ter verbos
        //A
        public class TableRepresenter {};
        public void saveCar(){};

        // Uma palavra por conceito
        //B
        public saveUser(){}; createAccount(){}; generateContract(){};


        //Use constants, enums instead of magic numbers, abbreviations
        //B
        public final int DAYS_IN_YEAR = 360;
        public final int HOURS_IN_WEEK = 168;
    }
}
