public class Gelaendewagen extends Das_Auto{
    
    String _maxKippradius;

    public Gelaendewagen(String marke, String typ, String ps, String preis, String maxKippradius){
        super(marke, typ, ps, preis);
        set_maxKippradius(_maxKippradius);
    }

    public String getMaxKippradius() {
        return _maxKippradius;
    }

    public void set_maxKippradius(String _maxKippradius) {
        this._maxKippradius = _maxKippradius;
    }
}
