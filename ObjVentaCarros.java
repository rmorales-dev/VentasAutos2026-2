public class ObjVentaCarros
{
    String Placa;
    int Modelo;
    String Marca;
    Double Valor;
    public ObjVentaCarros(String placa, int modelo, String marca, Double valor) {
        Placa = placa;
        Modelo = modelo;
        Marca = marca;
        Valor = valor;
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public int getModelo() {
        return Modelo;
    }
    public void setModelo(int modelo) {
        Modelo = modelo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public Double getValor() {
        return Valor;
    }
    public void setValor(Double valor) {
        Valor = valor;
    }

    
}