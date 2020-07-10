package com.arjuna.ats.internal.arjuna.thread;

import java.util.Deque;

import com.arjuna.ats.arjuna.coordinator.BasicAction;

import io.smallrye.context.storage.spi.StorageDeclaration;

public class ThreadActionDataStorageDeclaration implements StorageDeclaration<Deque<BasicAction>> {

}
