public class Das_Auto {
    
    String _marke;
    String _ps;
    String _typ;
    String _preis;

    public Das_Auto(String marke, String typ, String ps, String preis){
        setMarke(marke);
        setTyp(typ);
        setPs(ps);
        setPreis(_preis);
    }

    public String getMarke() {
        return _marke;
    }

    public String getTyp() {
        return _typ;
    }

    public String getPs() {
        return _ps;
    }

    public String getPreis() {
        return _preis;
    }

    public void setMarke(String _marke) {
        this._marke = _marke;
    }

    public void setTyp(String _typ) {
        this._typ = _typ;
    }

    public void setPs(String _ps) {
        this._ps = _ps;
    }

    public void setPreis(String _preis) {
        this._preis = _preis;
    }



}
