class disaster{

    String description;
    String state;
    String town;
    String people_affected;
    static int number = 1000000;
    int ID;
    public disaster(String d, String s, String t, String p) {
      ID = ++ number;
      this.description = d;
      this.state = s;
      this.town = t;
      this.people_affected = p;
      this.number = number + 1;
    }

    public String[] getLocation() {
      String[] s = new String[2];
      s[0] = this.town;
      s[1] = this.state;

      return s;
    }

    public String getPeople(){
      return people_affected;
    }

    public String getDescription(){
      return description;
    }

    public int getID(){
      return ID;
    }
}
