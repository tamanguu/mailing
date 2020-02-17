# mailing

This project contains tests of the `clojure-mail` package which in
turn utilizes the standard Java interface to mail. This project is
recommended reading for all developers who work with the backend and
mandatory reading for all developers who work with the mail interface
in the backend.

It contains all key use cases required for tamanguu.contacts.

## Installation

The following prerequisites MUST be installed and available:
* [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  version 1.8, and
* [Leiningen](https://leiningen.org) package manager version 2.6 or
  higher.

## Usage

Set up the enviroment variables `USERNAME` and `ACCESS_TOKEN` with
valid values for the Gmail username and the account access token. The
corresponding account MUST provide an IMAP interface.  Note that the
access token typically expires after 1 hour, so the tests should
complete soon.

Run the program and all relevant use cases with:

    $ lein run

The specific activities are shown in `src/mailing/core.clj`.

## Legal matter

The following licensing conditions and notices apply.

### License

Copyright © since 2018 Tamanguu GmbH & Co KG, see `LICENSE`.

