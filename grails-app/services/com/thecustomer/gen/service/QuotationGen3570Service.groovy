// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class QuotationGen3570Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 3904 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 3000 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 5207 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 7275 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 2209 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 2955 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 7443 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 2221 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 1217 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 7046 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 5343 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 4601 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId12() { return 4017 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 7442 }
    /** Derived accessor for reference (generated filler). */
    def computeReference14() { return 7662 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence15() { return 2528 }
    /** Derived accessor for region (generated filler). */
    def computeRegion16() { return 8966 }
}
