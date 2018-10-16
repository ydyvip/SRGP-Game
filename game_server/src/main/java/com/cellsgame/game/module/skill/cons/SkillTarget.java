package com.cellsgame.game.module.skill.cons;

/**
 * 技能目标枚举
 */
public enum SkillTarget {
    ;
    //    T1("跟随技能目标",1),
//    T2("自身",2),
//    T3("敌方全体",3),
//    T4("我方除自身外全体",4),
//    SELF("自身和技能目标以外的我方",5),
//    ALL_OUR_ARMY("我方全体",6),
//    ENEMY_MAX_HP_RANGE("敌方血量上限最高的目标",7),
//    ENEMY_MAX_HP("敌方当前血量最高的目标",8),
//    ENEMY_MAX_ATTACK("敌方攻击最高的目标",9),
//    ENEMY_MAX_SPEED("敌方速度最高的目标",10),
//    ENEMY_MAX_DEFENSE("敌方防守最高的目标",11),
//    ENEMY_MAX_MAGIC_DEFENSE("敌方魔防最高的目标",12),
//    ENEMY_MAX_TECHNIQUE("敌方技巧最高的目标",13),
//    ENEMY_MAX_LUCK("敌方幸运最高的目标",14),
//    ENEMY_MIN_HP_RANGE("敌方血量上限最低的目标",15),
//    ENEMY_MIN_HP("敌方当前血量最低的目标",16),
//    ENEMY_MIN_ATTACK("敌方攻击最低的目标",17),
//    ENEMY_MIN_SPEED("敌方速度最低的目标",18),
//    ENEMY_MIN_DEFENSE("敌方防守最低的目标",19),
//    ENEMY_MIN_MAGIC_DEFENSE("敌方魔防最低的目标",20),
//    ENEMY_MIN_TECHNIQUE("敌方技巧最低的目标",21),
//    ENEMY_MIN_LUCK("敌方幸运最低的目标",22),
//    OUR_MAX_HP_RANGE("我方血量上限最高的目标",23),
//    OUR_MAX_HP("我方当前血量最高的目标",24),
//    OUR_MAX_ATTACK("我方攻击最高的目标",25),
//    OUR_MAX_SPEED("我方速度最高的目标",26),
//    OUR_MAX_DEFENSE("我方防守最高的目标",27),
//    OUR_MAX_MAGIC_DEFENSE("我方魔防最高的目标",28),
//    OUR_MAX_TECHNIQUE("我方技巧最高的目标",29),
//    OUR_MAX_LUCK("我方幸运最高的目标",30),
//    OUR_MIN_HP_RANGE("我方血量上限最低的目标",31),
//    OUR_MIN_HP("我方当前血量最低的目标",32),
//    OUR_MIN_ATTACK("我方攻击最低的目标",33),
//    OUR_MIN_SPEED("我方速度最低的目标",34),
//    OUR_MIN_DEFENSE("我方防守最低的目标",35),
//    OUR_MIN_MAGIC_DEFENSE("我方魔防最低的目标",36),
//    OUR_MIN_TECHNIQUE("我方技巧最低的目标",37),
//    OUR_MIN_LUCK("我方幸运最低的目标",38),
//    ENEMY_ONE_GRID_AROUND_ME("以自身为中心1格范围内的敌方目标",39),
//    ENEMY_TWO_GRID_AROUND_ME("以自身为中心2格范围内的敌方目标",40),
//    OUR_ONE_GRID_AROUND_ME("以自身为中心1格范围内的我方目标",41),
//    OUR_TWO_GRID_AROUND_ME("以自身为中心2格范围内的我方目标",42),
//    ENEMY_ONE_GRID_AROUND_TARGET("以目标为中心1格范围内的敌方目标",43),
//    ENEMY_TWO_GRID_AROUND_TARGET("以目标为中心2格范围内的敌方目标",44),
//    OUR_ONE_GRID_AROUND_TARGET("以目标为中心1格范围内的我方目标",45),
//    OUR_TWO_GRID_AROUND_TARGET("以目标为中心2格范围内的我方目标",46),
//    OUR_ONE_GRID_AROUND_ME("以自身为中心除中心的1格范围内的我方目标",47),
//    OUR_ONE_GRID_AROUND_ME("以自身为中心除中心的2格范围内的我方目标",48),
//    OUR_ONE_GRID_AROUND_ME("以目标为中心除中心的1格范围内的敌方目标",49),
//    OUR_ONE_GRID_AROUND_ME("以目标为中心除中心的2格范围内的敌方目标",50),
//    OUR_ONE_GRID_AROUND_ME("以目标为中心除中心的1格范围内的我方目标",51),
//    OUR_ONE_GRID_AROUND_ME("以目标为中心除中心的2格范围内的我方目标",52),
//    OUR_ONE_GRID_AROUND_ME("以自身为中心除中心的1格范围内的敌方自身",53),
//    OUR_ONE_GRID_AROUND_ME("以自身为中心除中心的2格范围内的敌方自身",54),
//    OUR_ONE_GRID_AROUND_ME("以自身为中心十字站位上的敌方",55),
//SELF("以自身为中心十字站位上的我方",56),
//SELF("以自身为中心的横向一行的敌方",57),
//SELF("以自身为中心的横向一行的我方",58),
//SELF("以自身为中心的纵向一列的敌方",59),
//SELF("以自身为中心的纵向一列的我方",60),
//SELF("以目标为中心的横向一行3格的敌方",61),
//SELF("以自身为中心的横向一行3格的我方",62),
//SELF("以目标为中心的纵向一列3格的敌方",63),
//SELF("以自身为中心的纵向一列3格的我方",64),
//SELF("以目标为中心的横向一行5格的敌方",65),
//SELF("以自身为中心的横向一行5格的我方",66),
//SELF("以目标为中心的纵向一列5格的敌方",67),
//SELF("以自身为中心的纵向一列5格的我方",68),
//SELF("以自身为中心的横向三行的敌方",69),
//SELF("以自身为中心的横向三行的我方",70),
//SELF("以自身为中心的纵向三列的敌方",71),
//SELF("以自身为中心的纵向三列的我方",72),
//SELF("以目标为中心的斜一格范围目标",73),
//SELF("以目标为中心的斜九宫格范围目标",74),
//SELF("以目标为中心的双十字范围目标",75),
//SELF("以目标为中心的正九宫格范围目标",76),
//SELF("以目标为中心的纵向3行横向7行的目标",77);

    private String name;
    private Integer value;

    SkillTarget(String name, Integer value) {
        this.name = name;
        this.value = value;
    }
}