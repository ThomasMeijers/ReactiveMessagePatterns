package com.itsmeijers

import com.itsmeijers.PipesAndFilters.FilterPipeApp
import com.itsmeijers.MessageRouter.MessageRouterApp
import com.itsmeijers.MessageTranslator.MessageTranslatorApp
import com.itsmeijers.PublishSubscribeChannel.LocalEventStream.SubClassificationDriver
import com.itsmeijers.InvalidMessageChannel.InvalidMessageChannelApp
import com.itsmeijers.MessageBus.MessageBusApp

// For testing actor implementations see each App trait in the different packages

//object Main extends FilterPipeApp

//object Main extends MessageRouterApp

//object Main extends MessageTranslatorApp

//object Main extends InvalidMessageChannelApp

object Main extends MessageBusApp
