/*
 * Copyright © 2022 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */


package com.io7m.quixote.core;

import org.osgi.annotation.versioning.ProviderType;

import java.io.IOException;

/**
 * A factory of web servers.
 */

@ProviderType
public interface QWebServerFactoryType
{
  /**
   * Create a new web server that listens on the given port on localhost.
   *
   * @param port The port
   *
   * @return A new web server
   *
   * @throws IOException On errors
   */

  QWebServerType create(int port)
    throws IOException;

  /**
   * Create a new web server that listens on the given port on all available
   * IP addresses.
   *
   * @param port The port
   *
   * @return A new web server
   *
   * @throws IOException On errors
   * @since 1.1.0
   */

  QWebServerType createForAll(int port)
    throws IOException;
}
