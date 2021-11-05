public class Sportwagen extends Das_Auto{
    
    String _geschwindigkeit;


    public Sportwagen(String marke, String typ, String ps, String preis, String geschwindigkeit){
        super(marke, typ, ps, preis);
        setGeschwindigkeit(geschwindigkeit);
    } 

    public String getGeschwindigkeit() {
        return _geschwindigkeit;
    }

    public void setGeschwindigkeit(String _geschwindigkeit) {
        this._geschwindigkeit = _geschwindigkeit;
    }




}
