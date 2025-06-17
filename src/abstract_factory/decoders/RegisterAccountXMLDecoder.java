package abstract_factory.decoders;

import abstract_factory.MsgRegisterAccount;

public class RegisterAccountXMLDecoder implements RegisterAccountDecoder {
  public MsgRegisterAccount decode(String mensagem) {
    System.out.println("Decodificando conta em XML");
    return new MsgRegisterAccount();
  }
}