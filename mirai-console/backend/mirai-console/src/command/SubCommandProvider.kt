package net.mamoe.mirai.console.command

import net.mamoe.mirai.console.command.descriptor.CommandSignatureFromKFunction
import net.mamoe.mirai.console.command.descriptor.ExperimentalCommandDescriptors
import net.mamoe.mirai.console.util.ConsoleExperimentalApi

interface SubCommandProvider {

    /**
     * 被聚合时提供的子指令
     */
    @ConsoleExperimentalApi("Property name is experimental")
    @ExperimentalCommandDescriptors
    public val provideOverloads: List<@JvmWildcard CommandSignatureFromKFunction>
}