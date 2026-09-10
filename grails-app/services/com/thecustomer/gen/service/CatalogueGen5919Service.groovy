// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class CatalogueGen5919Service {

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
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 2090 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 6382 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 7747 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 2367 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 2952 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 464 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 497 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 6878 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes8() { return 4853 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 6322 }
    /** Derived accessor for category (generated filler). */
    def computeCategory10() { return 7576 }
    /** Derived accessor for reference (generated filler). */
    def computeReference11() { return 4526 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId12() { return 6268 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 2964 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 6481 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice15() { return 4996 }
}
