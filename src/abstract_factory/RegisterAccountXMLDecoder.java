package abstract_factory;

public class RegisterAccountXMLDecoder implements RegisterAccountDecoder {
  public MsgRegisterAccount decode(String mensagem) {
    System.out.println("Decodificando conta em XML");
    return new MsgRegisterAccount();
  }
}