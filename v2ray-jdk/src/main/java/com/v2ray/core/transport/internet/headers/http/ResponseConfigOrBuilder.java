// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/headers/http/config.proto

package com.v2ray.core.transport.internet.headers.http;

public interface ResponseConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.transport.internet.headers.http.ResponseConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.v2ray.core.transport.internet.headers.http.Version version = 1;</code>
   */
  boolean hasVersion();
  /**
   * <code>.v2ray.core.transport.internet.headers.http.Version version = 1;</code>
   */
  Version getVersion();
  /**
   * <code>.v2ray.core.transport.internet.headers.http.Version version = 1;</code>
   */
  VersionOrBuilder getVersionOrBuilder();

  /**
   * <code>.v2ray.core.transport.internet.headers.http.Status status = 2;</code>
   */
  boolean hasStatus();
  /**
   * <code>.v2ray.core.transport.internet.headers.http.Status status = 2;</code>
   */
  Status getStatus();
  /**
   * <code>.v2ray.core.transport.internet.headers.http.Status status = 2;</code>
   */
  StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .v2ray.core.transport.internet.headers.http.Header header = 3;</code>
   */
  java.util.List<Header>
      getHeaderList();
  /**
   * <code>repeated .v2ray.core.transport.internet.headers.http.Header header = 3;</code>
   */
  Header getHeader(int index);
  /**
   * <code>repeated .v2ray.core.transport.internet.headers.http.Header header = 3;</code>
   */
  int getHeaderCount();
  /**
   * <code>repeated .v2ray.core.transport.internet.headers.http.Header header = 3;</code>
   */
  java.util.List<? extends HeaderOrBuilder>
      getHeaderOrBuilderList();
  /**
   * <code>repeated .v2ray.core.transport.internet.headers.http.Header header = 3;</code>
   */
  HeaderOrBuilder getHeaderOrBuilder(
          int index);
}
