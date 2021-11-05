public class Kombi extends Das_Auto{
    
    String _siebensitzer;

    public Kombi(String marke, String typ, String ps, String preis, String siebensitzer){
        super(marke, typ, ps, preis);
        setSiebensitzer(_siebensitzer);
    }

    public String getSiebensitzer() {
        return _siebensitzer;
    }

    public void setSiebensitzer(String _siebensitzer) {
        this._siebensitzer = _siebensitzer;
    }


}
