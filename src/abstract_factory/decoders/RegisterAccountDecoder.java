package abstract_factory.decoders;

import abstract_factory.MsgRegisterAccount;

public interface RegisterAccountDecoder {
  MsgRegisterAccount decode(String mensagem);
}
