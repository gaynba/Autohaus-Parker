public class LKW extends Das_Auto{
    
    int _maxZuladungTonnen;

    public LKW(String marke, String typ, String ps, String preis, String maxZuladungTonnen){
        super(marke, typ, ps, preis);
        setMaxZuladungTonnen(_maxZuladungTonnen);

    }


    public int getMaxZuladungTonnen() {
        return _maxZuladungTonnen;
    }

    public void setMaxZuladungTonnen(int _maxZuladungTonnen) {
        this._maxZuladungTonnen = _maxZuladungTonnen;
    }

}
