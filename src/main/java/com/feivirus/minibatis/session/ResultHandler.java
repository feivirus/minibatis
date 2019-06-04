package com.feivirus.minibatis.session;

public interface ResultHandler <T> {
    void handleResult(ResultContext<? extends T> resultContext);
}
