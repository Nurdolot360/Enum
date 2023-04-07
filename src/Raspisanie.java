public enum Raspisanie {
    PANIDELNIK("sabak"),
    FTORNIK("seyshen"),
    CREDA("sabak"),
    CHETVERT("saysen"),
    PIATNISA("sabak"),
    SUBOTA("englesh i saysen"),
    VOSKRESENIE("fodbool");

   private  final String rasrisanies;


    Raspisanie( String rasrisanies) {
        this.rasrisanies = rasrisanies;
    }

    public String getRasrisanies() {
        return rasrisanies;
    }

    @Override
    public String toString() {
        return rasrisanies ;
    }
}
