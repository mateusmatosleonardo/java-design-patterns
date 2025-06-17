package abstract_factory;

public class RegisterClientXMLDecoder implements RegisterClientDecoder {
  public MsgRegisterClient decode(String mensagem) {
    System.out.println("Decodificando cliente em XML");
    return new MsgRegisterClient();
  }
}