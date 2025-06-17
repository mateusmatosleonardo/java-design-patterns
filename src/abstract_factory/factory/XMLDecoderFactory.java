package abstract_factory.factory;

import abstract_factory.decoders.RegisterAccountXMLDecoder;
import abstract_factory.decoders.RegisterClientXMLDecoder;
import abstract_factory.decoders.RegisterAccountDecoder;
import abstract_factory.decoders.RegisterClientDecoder;

public class XMLDecoderFactory extends DecoderFactory {

  @Override
  public RegisterClientDecoder createRegisterClientDecoder() {
    return new RegisterClientXMLDecoder();
  }

  @Override
  public RegisterAccountDecoder createRegistrarAccountDecoder() {
    return new RegisterAccountXMLDecoder();
  }
}
