
package abi36_0_0.expo.modules.crypto;

import android.content.Context;

import java.util.Collections;
import java.util.List;

import abi36_0_0.org.unimodules.core.BasePackage;
import abi36_0_0.org.unimodules.core.ExportedModule;
import abi36_0_0.org.unimodules.core.ViewManager;

public class CryptoPackage extends BasePackage {
  @Override
  public List<ExportedModule> createExportedModules(Context context) {
    return Collections.singletonList((ExportedModule) new CryptoModule(context));
  }
}
