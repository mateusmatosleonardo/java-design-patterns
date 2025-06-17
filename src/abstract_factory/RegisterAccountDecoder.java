package abstract_factory;

public interface RegisterAccountDecoder {
  MsgRegisterAccount decode(String mensagem);
}
