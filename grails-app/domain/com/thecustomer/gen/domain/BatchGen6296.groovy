// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class BatchGen6296 {

    Integer externalId0
    String sequence1
    String active2
    String externalId3
    Integer sequence4
    Integer priority5
    Integer sequence6

    static constraints = {
        externalId0 nullable: true
        sequence1 nullable: true, maxSize: 255
        active2 nullable: true, maxSize: 255
        externalId3 nullable: true, maxSize: 255
        sequence4 nullable: true
        priority5 nullable: true
        sequence6 nullable: true
    }

    static mapping = {
        table 'pricing_gen_6296'
    }

    String toString() { "BatchGen6296(${id})" }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 4044 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 7097 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 3387 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 8425 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 8767 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 8180 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 2880 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 9734 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 495 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 7873 }
}
