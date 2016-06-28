# AndroidOpenWrtRemote
Remote management and configuration app for OpenWRT/LEDE

## What is it?
Some crowdsourcing campaigns are about routers not being secure/fast enough and use a fork of OpenWRT that in some cases is accompanied with an app. Unfortunately the app uses a proprietary API that is nor compatible with the original OpenWRT calls to LUCI. This project aims to be a remote that allows less technical people to manage an OpenWRT/LEDE box with a simple app.

## What can it do?
Currently: barely anything (just detect whether an OpenWRT/LEDE router is present at the specified IP

## What will it do?
* Login/logout
* Reboot
* Display status information (load, memory, connections)
* Display WiFi status (connected stations per radio)
* Toggle/Configure WiFi (but only AP mode, Channel, SSID, Encryption Method and passphrase for now)
* Add/remove port forwards

## Can I help?
Well, yes, of course! The OpenWRTAPI Class needs some more implementations of interactions with LUCI. It would be great if LUCI responses could be deserialized to classes so that they can be used in the app. See the feature list for calls that we'd like to have deserialized.

## What's the license?
ASL2.0: https://source.android.com/source/licenses.html
