# used-from-native-code

[![DUB](https://img.shields.io/dub/l/vibe-d.svg)](LICENSE.txt)

Example code to explain `@UsedFromNativeCode` annotation. It can clarify where the method is used and suppress unused warning effectively. Moreover, it makes ProGuard configuration short and easy.

```java
public class NativeCallback {

    @UsedFromNativeCode
    void onLogin(String userId, String token) {
        ...
    }
}
```

```ini
-keep,allowobfuscation @interface io.github.sangsoonam.UsedFromNativeCode
-keepclassmembers class * {
    @io.github.sangsoonam.UsedFromNativeCode *;
}
```
