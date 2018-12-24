package ru.javabit.server;

import ru.javabit.Game;
import ru.javabit.SingleGame;
import ru.javabit.VictoryTrigger;
import ru.javabit.exceptions.BattleShipsException;
import ru.javabit.gameField.GameField;
import ru.javabit.report.ConsoleDialogue;
import ru.javabit.report.Report;
import ru.javabit.report.UserDialogue;
import ru.javabit.ship.Fleet;
import ru.javabit.ship.FleetsDisposal;
import ru.javabit.turn.TurnMaster;
import ru.javabit.view.GameFieldRenderable;
import ru.javabit.view.GameFieldSwingRenderer;

public class MultiplayerGame implements Game {

    private static Game game;
    UserDialogue dialogue;
    GameField gameField;
    FleetsDisposal fleetsDisposal;
    GameFieldRenderable gameFieldRenderer;
    //GameFieldRenderer gameFieldRenderer;
    //GameFieldSwingRenderer gameFieldSwingRenderer;
    Fleet fleet1;
    Fleet fleet2;
    TurnMaster turnMaster;
    VictoryTrigger victoryTrigger;

    private MultiplayerGame(){ }

    public static Game getInstance(){
        if(game == null){
            game = new MultiplayerGame();
        }
        return game;
    }

    @Override
    public void initGame() throws BattleShipsException {
        System.out.println("1");
        gameField = new GameField(11, 11,"computer 1", "computer 2");
        fleet1 = new Fleet();
        fleet2 = new Fleet();
        fleetsDisposal = new FleetsDisposal(gameField, fleet1, fleet2);
        fleetsDisposal.disposeAutoAuto();
        System.out.println("2");
    }

    @Override
    public void startGame() throws InterruptedException {
        System.out.println("3");
        victoryTrigger = new VictoryTrigger(fleet1, fleet2);
        turnMaster = TurnMaster.getInstance();
        turnMaster.setIsServer(true);
        turnMaster.initComputerVsComputer(gameField, "human", "computer");
        turnMaster.setVictoryTrigger(victoryTrigger);
        new Thread(turnMaster).start();
        System.out.println("4");
    }

    @Override
    public Fleet getFleet1() {
        return fleet1;
    }

    @Override
    public Fleet getFleet2() {
        return fleet2;
    }















}