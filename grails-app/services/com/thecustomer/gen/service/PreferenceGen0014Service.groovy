// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen0014Service {

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
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 1584 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 3494 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 1896 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 8308 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 5413 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 947 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 4267 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 7330 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 4393 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 3337 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 9922 }
    /** Derived accessor for version (generated filler). */
    def computeVersion11() { return 4451 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 5127 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 4822 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 3148 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice15() { return 5586 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity16() { return 6687 }
}
