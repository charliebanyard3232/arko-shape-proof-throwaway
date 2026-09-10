// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class TenancyGen5036 {

    Boolean active0
    String amount1
    Date externalId2
    Boolean currency3
    Integer description4
    String createdOn5
    Integer unitPrice6
    Boolean weightKg7
    BigDecimal version8

    static constraints = {
        active0 nullable: true
        amount1 nullable: true, maxSize: 255
        externalId2 nullable: true
        currency3 nullable: true
        description4 nullable: true
        createdOn5 nullable: true, maxSize: 255
        unitPrice6 nullable: true
        weightKg7 nullable: true
        version8 nullable: true
    }

    static mapping = {
        table 'inventory_gen_5036'
    }

    String toString() { "TenancyGen5036(${id})" }
    /** Derived accessor for reference (generated filler). */
    def computeReference0() { return 5718 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 1866 }
    /** Derived accessor for region (generated filler). */
    def computeRegion2() { return 6307 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 5755 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 1566 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 2229 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 5261 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 8814 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 2342 }
}
