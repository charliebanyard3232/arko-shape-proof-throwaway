// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LedgerGen5984 {

    Date weightKg0
    Integer version1
    Date description2
    Boolean percentage3
    Date category4
    String status5
    String quantity6
    Boolean sequence7
    Date updatedOn8

    static constraints = {
        weightKg0 nullable: true
        version1 nullable: true
        description2 nullable: true
        percentage3 nullable: true
        category4 nullable: true
        status5 nullable: true, maxSize: 255
        quantity6 nullable: true, maxSize: 255
        sequence7 nullable: true
        updatedOn8 nullable: true
    }

    static mapping = {
        table 'catalogue_gen_5984'
    }

    String toString() { "LedgerGen5984(${id})" }
    /** Derived accessor for label (generated filler). */
    def computeLabel0() { return 3591 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 4020 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 9490 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 8263 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 4883 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 4764 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 9458 }
}
