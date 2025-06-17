package abstract_factory;

public class IntegrationService {

  public void registerClient(String text, String origin) {
    RegisterClientDecoder msgDecoder = null;

    // ACOPLAMENTO: A lógica está diretamente acoplada às classes concretas.
    // Para cada nova origem ou novo formato, será necessário modificar este bloco.
    if("X".equals(origin)) {
      msgDecoder = new RegisterClientXMLDecoder();
    } else if ("Y".equals(origin)) {
      msgDecoder = new RegisterClientCSVDecoder();
    } else if ("Z".equals(origin)) {
      msgDecoder = new RegisterClientFixedTextDecoder();
    }

    MsgRegisterClient msg = msgDecoder.decode(text);
  }

  public void registerAccount(String text, String origin) {
    RegisterAccountDecoder msgDecoder = null;

    // REPETIÇÃO DE LÓGICA: Mesmo padrão do metodo acima.
    // A estrutura se repete para cada tipo de mensagem (Cliente, Conta...).
    if("X".equals(origin)) {
      msgDecoder = new RegisterAccountXMLDecoder();
    } else if ("Y".equals(origin)) {
      msgDecoder = new RegistrarAccountCSVDecoder();
    } else if ("Z".equals(origin)) {
      msgDecoder = new RegistrarAccountTextoFixoDecoder();
    }

    MsgRegisterAccount msg = msgDecoder.decode(text);
  }
}
