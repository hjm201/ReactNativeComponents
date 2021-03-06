package software.sitb.react.camera;

import com.facebook.react.uimanager.ThemedReactContext;
import software.sitb.react.camera.commons.AbstractCameraViewManager;

/**
 * @author 田尘殇Sean sean.snow@live.com
 */
public class CameraViewManager extends AbstractCameraViewManager<CameraView> {
    @Override
    public String getName() {
        return "SitbRCTCameraView";
    }

    @Override
    protected CameraView createViewInstance(ThemedReactContext reactContext) {
        return new CameraView(reactContext);
    }
}
